package com.gy4j.jvm.eye.core.command.vmtool;

import arthas.VmTool;
import com.gy4j.jvm.eye.core.client.IClient;
import com.gy4j.jvm.eye.core.command.AbstractCommand;
import com.gy4j.jvm.eye.core.command.vmtool.response.AllLoadedClassesReponse;
import com.gy4j.jvm.eye.core.command.vmtool.vo.KlassVO;
import com.gy4j.jvm.eye.core.response.IResponse;
import com.gy4j.jvm.eye.core.util.JsonUtils;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

@Data
public class AllLoadedClassesCommand extends AbstractCommand {
    private static final Logger logger = LoggerFactory.getLogger(AllLoadedClassesCommand.class);


    @Override
    public IResponse executeForResponse(IClient client) {
        VmTool vmTool = VmTool.getInstance();
        Class<?>[] allLoadedClasses = vmTool.getAllLoadedClasses();
        ArrayList<KlassVO> klassVOS = new ArrayList<>();
        for (int i=0;i<allLoadedClasses.length;i++){
            Class<?> aClass = allLoadedClasses[i];
            KlassVO v = new KlassVO();
            v.setKlcssName(aClass.getName());
            klassVOS.add(v);
            logger.info(aClass.getName());
        }
        AllLoadedClassesReponse reponse = new AllLoadedClassesReponse();
        reponse.setKlassVOList(klassVOS);
        return reponse;
    }

    @Override
    public Class<? extends IResponse> getResponseClass() {
        return AllLoadedClassesReponse.class;
    }
}
