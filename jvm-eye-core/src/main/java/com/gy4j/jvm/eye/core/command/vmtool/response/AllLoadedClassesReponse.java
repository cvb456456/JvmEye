package com.gy4j.jvm.eye.core.command.vmtool.response;

import com.gy4j.jvm.eye.core.command.vmtool.AllLoadedClassesCommand;
import com.gy4j.jvm.eye.core.command.vmtool.vo.KlassVO;
import com.gy4j.jvm.eye.core.response.BaseResponse;
import com.gy4j.jvm.eye.core.util.JsonUtils;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AllLoadedClassesReponse extends BaseResponse {
    private List<KlassVO> klassVOList;

//    public static void main(String[] args) {
//        AllLoadedClassesReponse a = new AllLoadedClassesReponse();
//        ArrayList<KlassVO> klassVOS = new ArrayList<>();
//        klassVOS.add(new KlassVO(){{
//            setClassName("aaa");
//        }});
//        a.setKlassVOList(klassVOS);
//        String s = JsonUtils.toJson(a);
//        System.out.println(s);
//    }
}
