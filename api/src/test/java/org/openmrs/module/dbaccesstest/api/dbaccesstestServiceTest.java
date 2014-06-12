/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.dbaccesstest.api;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.test.BaseModuleContextSensitiveTest;

/**
 * Tests {@link ${dbaccesstestService}}.
 */
public class  dbaccesstestServiceTest extends BaseModuleContextSensitiveTest {
	
	@Test
	public void shouldSetupContext() {
		assertNotNull(Context.getService(dbaccesstestService.class));
	}
	@Test
	public void shouldReturnText() {
		System.out.println("This test ran");
		List<Patient> patients = Context.getPatientService().getAllPatients();
		for (Patient patient : patients) {
		  System.out.println("Patient: " + patient.getGivenName() + " " + patient.getFamilyName());
		}
	}
}
