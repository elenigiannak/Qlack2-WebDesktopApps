package com.eurodyn.qlack2.webdesktop.apps.usermanagement.api.request.config;

import java.util.List;

import com.eurodyn.qlack2.fuse.idm.api.signing.QSignedRequest;
import com.eurodyn.qlack2.webdesktop.api.dto.SecureOperationAccessDTO;

public class SaveSecureOperationsRequest extends QSignedRequest {
	private String subjectId;
	private List<SecureOperationAccessDTO> operations;

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public List<SecureOperationAccessDTO> getOperations() {
		return operations;
	}

	public void setOperations(List<SecureOperationAccessDTO> operations) {
		this.operations = operations;
	}
}
