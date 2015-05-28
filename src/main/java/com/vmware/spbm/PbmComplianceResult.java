package com.vmware.spbm;
import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;

/**
 * Created by Michael Rice on Wed May 27 23:54:26 CDT 2015
 * This code is auto generated using yavijava_generator
 * https://github.com/yavijava/yavijava_generator
 *
 * Copyright 2015 Michael Rice
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * @since 6.0
 */

public class PbmComplianceResult extends DynamicData {
    @Getter @Setter public Calendar checkTime;
    @Getter @Setter public PbmServerObjectRef entity;
    @Getter @Setter public PbmProfileId profile;
    @Getter @Setter public String complianceStatus;
    @Getter @Setter public boolean mismatch;
    @Getter @Setter public PbmCompliancePolicyStatus[] violatedPolicies;
    @Getter @Setter public PbmComplianceOperationalStatus operationalStatus;
}
