/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for OutputFileUploadCondition.
 */
public enum OutputFileUploadCondition {
    /** Upload the file(s) only after the task process exits with an exit code of 0. */
    TASK_SUCCESS("tasksuccess"),

    /** Upload the file(s) only after the task process exits with a nonzero exit code. */
    TASK_FAILURE("taskfailure"),

    /** Upload the file(s) after the task process exits, no matter what the exit code was. */
    TASK_COMPLETION("taskcompletion");

    /** The actual serialized value for a OutputFileUploadCondition instance. */
    private String value;

    OutputFileUploadCondition(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OutputFileUploadCondition instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed OutputFileUploadCondition object, or null if unable to parse.
     */
    @JsonCreator
    public static OutputFileUploadCondition fromString(String value) {
        OutputFileUploadCondition[] items = OutputFileUploadCondition.values();
        for (OutputFileUploadCondition item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
