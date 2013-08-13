package com.citytechinc.cq.component.dialog.html5smartfile;

import com.citytechinc.cq.component.dialog.widget.WidgetParameters;
import com.citytechinc.cq.component.util.Constants;

public class Html5SmartFileWidgetParameters extends WidgetParameters {
	private boolean allowFileNameEditing;
	private boolean allowFileReference;
	private boolean allowUpload;
	private String ddAccept;
	private String ddGroups;
	private String fileNameParameter;
	private String fileReferenceParameter;
	private String mimeTypes;
	private String mimeTypesDescription;
	private int sizeLimit;

	public boolean isAllowFileNameEditing() {
		return allowFileNameEditing;
	}

	public void setAllowFileNameEditing(boolean allowFileNameEditing) {
		this.allowFileNameEditing = allowFileNameEditing;
	}

	public boolean isAllowFileReference() {
		return allowFileReference;
	}

	public void setAllowFileReference(boolean allowFileReference) {
		this.allowFileReference = allowFileReference;
	}

	public boolean isAllowUpload() {
		return allowUpload;
	}

	public void setAllowUpload(boolean allowUpload) {
		this.allowUpload = allowUpload;
	}

	public String getDdAccept() {
		return ddAccept;
	}

	public void setDdAccept(String ddAccept) {
		this.ddAccept = ddAccept;
	}

	public String getDdGroups() {
		return ddGroups;
	}

	public void setDdGroups(String ddGroups) {
		this.ddGroups = ddGroups;
	}

	public String getFileNameParameter() {
		return fileNameParameter;
	}

	public void setFileNameParameter(String fileNameParameter) {
		this.fileNameParameter = fileNameParameter;
	}

	public String getFileReferenceParameter() {
		return fileReferenceParameter;
	}

	public void setFileReferenceParameter(String fileReferenceParameter) {
		this.fileReferenceParameter = fileReferenceParameter;
	}

	public String getMimeTypes() {
		return mimeTypes;
	}

	public void setMimeTypes(String mimeTypes) {
		this.mimeTypes = mimeTypes;
	}

	public String getMimeTypesDescription() {
		return mimeTypesDescription;
	}

	public void setMimeTypesDescription(String mimeTypesDescription) {
		this.mimeTypesDescription = mimeTypesDescription;
	}

	public int getSizeLimit() {
		return sizeLimit;
	}

	public void setSizeLimit(int sizeLimit) {
		this.sizeLimit = sizeLimit;
	}

	@Override
	public String getPrimaryType() {
		return Constants.CQ_WIDGET;
	}

	@Override
	public void setPrimaryType(String primaryType) {
		throw new UnsupportedOperationException("PrimaryType is Static for Html5SmartFileWidget");
	}

	@Override
	public String getXtype() {
		return Html5SmartFileWidget.XTYPE;
	}

	@Override
	public void setXtype(String xtype) {
		throw new UnsupportedOperationException("xtype is Static for Html5SmartFileWidget");
	}
}
