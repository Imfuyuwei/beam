/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.beam.sdk.tpcds;

import org.apache.beam.sdk.PipelineResult;
import org.apache.beam.sdk.options.PipelineOptions;

public class TpcdsRunResult {
    private double elapsedTime;
    private PipelineOptions pipelineOptions;
    private PipelineResult pipelineResult;

    public TpcdsRunResult(double elapsedTime, PipelineOptions pipelineOptions, PipelineResult pipelineResult) {
        this.elapsedTime = elapsedTime;
        this.pipelineOptions = pipelineOptions;
        this.pipelineResult = pipelineResult;
    }

    public double getElapsedTime() { return elapsedTime; }

    public PipelineOptions getPipelineOptions() { return pipelineOptions; }

    public PipelineResult getPipelineResult() { return pipelineResult; }

    public String getJobName() {
        PipelineOptions pipelineOptions = getPipelineOptions();
        return pipelineOptions.getJobName();
    }
}
