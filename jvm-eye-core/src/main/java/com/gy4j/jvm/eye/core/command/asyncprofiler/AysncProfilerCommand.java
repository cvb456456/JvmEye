package com.gy4j.jvm.eye.core.command.asyncprofiler;

import com.gy4j.jvm.eye.core.client.IClient;
import com.gy4j.jvm.eye.core.command.AbstractCommand;
import com.gy4j.jvm.eye.core.command.asyncprofiler.reponse.AsyncProfilerResponse;
import com.gy4j.jvm.eye.core.response.IResponse;

public class AysncProfilerCommand  extends AbstractCommand {
    @Override
    public IResponse executeForResponse(IClient client) {
        return null;
    }

    @Override
    public Class<? extends IResponse> getResponseClass() {
        return AsyncProfilerResponse.class;
    }
}
