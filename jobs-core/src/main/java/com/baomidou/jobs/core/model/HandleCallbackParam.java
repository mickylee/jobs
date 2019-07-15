package com.baomidou.jobs.core.model;

import com.baomidou.jobs.core.web.JobsResponse;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 处理器回调参数
 *
 * @author jobob
 * @since 2019-07-15
 */
@Data
@ToString
public class HandleCallbackParam implements Serializable {
    private Long logId;
    private Long logDateTime;

    private JobsResponse<String> executeResult;

    public HandleCallbackParam() {
        // to do nothing
    }

    public HandleCallbackParam(Long logId, Long logDateTime, JobsResponse<String> executeResult) {
        this.logId = logId;
        this.logDateTime = logDateTime;
        this.executeResult = executeResult;
    }
}
