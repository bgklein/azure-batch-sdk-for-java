/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains information about the execution of a job in the Azure Batch
 * service.
 */
public class JobExecutionInformation {
    /**
     * The start time of the job.
     * This is the time at which the job was created.
     */
    @JsonProperty(value = "startTime", required = true)
    private DateTime startTime;

    /**
     * The completion time of the job.
     * This property is set only if the job is in the completed state.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * The ID of the pool to which this job is assigned.
     * This element contains the actual pool where the job is assigned. When
     * you get job details from the service, they also contain a poolInfo
     * element, which contains the pool configuration data from when the job
     * was added or updated. That poolInfo element may also contain a poolId
     * element. If it does, the two IDs are the same. If it does not, it means
     * the job ran on an auto pool, and this property contains the ID of that
     * auto pool.
     */
    @JsonProperty(value = "poolId")
    private String poolId;

    /**
     * Details of any error encountered by the service in starting the job.
     * This property is not set if there was no error starting the job.
     */
    @JsonProperty(value = "schedulingError")
    private JobSchedulingError schedulingError;

    /**
     * A string describing the reason the job ended.
     * This property is set only if the job is in the completed state. If the
     * Batch service terminates the job, it sets the reason as follows:
     * JMComplete - the Job Manager task completed, and killJobOnCompletion was
     * set to true. MaxWallClockTimeExpiry - the job reached its
     * maxWallClockTime constraint. TerminateJobSchedule - the job ran as part
     * of a schedule, and the schedule terminated. AllTasksComplete - the job's
     * onAllTasksComplete attribute is set to terminatejob, and all tasks in
     * the job are complete. TaskFailed - the job's onTaskFailure attribute is
     * set to performExitOptionsJobAction, and a task in the job failed with an
     * exit condition that specified a jobAction of terminatejob. Any other
     * string is a user-defined reason specified in a call to the 'Terminate a
     * job' operation.
     */
    @JsonProperty(value = "terminateReason")
    private String terminateReason;

    /**
     * Get this is the time at which the job was created.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set this is the time at which the job was created.
     *
     * @param startTime the startTime value to set
     * @return the JobExecutionInformation object itself.
     */
    public JobExecutionInformation withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get this property is set only if the job is in the completed state.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set this property is set only if the job is in the completed state.
     *
     * @param endTime the endTime value to set
     * @return the JobExecutionInformation object itself.
     */
    public JobExecutionInformation withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get this element contains the actual pool where the job is assigned. When you get job details from the service, they also contain a poolInfo element, which contains the pool configuration data from when the job was added or updated. That poolInfo element may also contain a poolId element. If it does, the two IDs are the same. If it does not, it means the job ran on an auto pool, and this property contains the ID of that auto pool.
     *
     * @return the poolId value
     */
    public String poolId() {
        return this.poolId;
    }

    /**
     * Set this element contains the actual pool where the job is assigned. When you get job details from the service, they also contain a poolInfo element, which contains the pool configuration data from when the job was added or updated. That poolInfo element may also contain a poolId element. If it does, the two IDs are the same. If it does not, it means the job ran on an auto pool, and this property contains the ID of that auto pool.
     *
     * @param poolId the poolId value to set
     * @return the JobExecutionInformation object itself.
     */
    public JobExecutionInformation withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * Get this property is not set if there was no error starting the job.
     *
     * @return the schedulingError value
     */
    public JobSchedulingError schedulingError() {
        return this.schedulingError;
    }

    /**
     * Set this property is not set if there was no error starting the job.
     *
     * @param schedulingError the schedulingError value to set
     * @return the JobExecutionInformation object itself.
     */
    public JobExecutionInformation withSchedulingError(JobSchedulingError schedulingError) {
        this.schedulingError = schedulingError;
        return this;
    }

    /**
     * Get this property is set only if the job is in the completed state. If the Batch service terminates the job, it sets the reason as follows: JMComplete - the Job Manager task completed, and killJobOnCompletion was set to true. MaxWallClockTimeExpiry - the job reached its maxWallClockTime constraint. TerminateJobSchedule - the job ran as part of a schedule, and the schedule terminated. AllTasksComplete - the job's onAllTasksComplete attribute is set to terminatejob, and all tasks in the job are complete. TaskFailed - the job's onTaskFailure attribute is set to performExitOptionsJobAction, and a task in the job failed with an exit condition that specified a jobAction of terminatejob. Any other string is a user-defined reason specified in a call to the 'Terminate a job' operation.
     *
     * @return the terminateReason value
     */
    public String terminateReason() {
        return this.terminateReason;
    }

    /**
     * Set this property is set only if the job is in the completed state. If the Batch service terminates the job, it sets the reason as follows: JMComplete - the Job Manager task completed, and killJobOnCompletion was set to true. MaxWallClockTimeExpiry - the job reached its maxWallClockTime constraint. TerminateJobSchedule - the job ran as part of a schedule, and the schedule terminated. AllTasksComplete - the job's onAllTasksComplete attribute is set to terminatejob, and all tasks in the job are complete. TaskFailed - the job's onTaskFailure attribute is set to performExitOptionsJobAction, and a task in the job failed with an exit condition that specified a jobAction of terminatejob. Any other string is a user-defined reason specified in a call to the 'Terminate a job' operation.
     *
     * @param terminateReason the terminateReason value to set
     * @return the JobExecutionInformation object itself.
     */
    public JobExecutionInformation withTerminateReason(String terminateReason) {
        this.terminateReason = terminateReason;
        return this;
    }

}
