/*
 * Copyright (c) 2015 University of Ulm
 *
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.  Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package de.uniulm.omi.cloudiator.colosseum.client.entities;

import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.AbstractEntity;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Link;
import de.uniulm.omi.cloudiator.colosseum.client.entities.internal.Path;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by frank on 21.01.15.
 */
@Path("instance")
public class Instance extends AbstractEntity<Instance> {

    private Long applicationComponent;
    private Long applicationInstance;
    private Long virtualMachine;

    public Instance(@Nullable List<Link> links, Long applicationComponent, Long applicationInstance, Long virtualMachine) {
        super(links);
        this.applicationComponent = applicationComponent;
        this.virtualMachine = virtualMachine;
        this.applicationInstance = applicationInstance;
    }

    public Instance(Long applicationComponent, Long applicationInstance, Long virtualMachine) {
        this(null, applicationComponent, applicationInstance, virtualMachine);
    }

    protected Instance() {
    }

    public Long getApplicationComponent() {
        return applicationComponent;
    }

    public void setApplicationComponent(Long applicationComponent) {
        this.applicationComponent = applicationComponent;
    }

    public Long getVirtualMachine() {
        return virtualMachine;
    }

    public void setVirtualMachine(Long virtualMachine) {
        this.virtualMachine = virtualMachine;
    }

    public Long getApplicationInstance() {
        return applicationInstance;
    }

    public void setApplicationInstance(Long applicationInstance) {
        this.applicationInstance = applicationInstance;
    }

    @Override public int compareTo(Instance o) {
        if(this.getApplicationComponent().equals(o.getApplicationComponent()) &&
            this.getApplicationInstance().equals(o.getApplicationInstance()) &&
            this.getVirtualMachine().equals(o.getVirtualMachine())) {
            return 0;
        }

        return -1;
    }
}
