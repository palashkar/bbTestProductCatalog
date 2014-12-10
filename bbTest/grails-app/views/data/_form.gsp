<%@ page import="org.bb.domain.Data" %>



<div class="fieldcontain ${hasErrors(bean: dataInstance, field: 'brandId', 'error')} required">
	<label for="brandId">
		<g:message code="data.brandId.label" default="Brand Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="brandId" required="" value="${dataInstance?.brandId}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dataInstance, field: 'description', 'error')} required">
	<label for="description">
		<g:message code="data.description.label" default="Description" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="description" required="" value="${dataInstance?.description}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dataInstance, field: 'discontinued', 'error')} required">
	<label for="discontinued">
		<g:message code="data.discontinued.label" default="Discontinued" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="discontinued" required="" value="${dataInstance?.discontinued}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dataInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="data.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${dataInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dataInstance, field: 'numberSoldInLast30Days', 'error')} required">
	<label for="numberSoldInLast30Days">
		<g:message code="data.numberSoldInLast30Days.label" default="Number Sold In Last30 Days" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="numberSoldInLast30Days" required="" value="${dataInstance?.numberSoldInLast30Days}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dataInstance, field: 'productUrl', 'error')} required">
	<label for="productUrl">
		<g:message code="data.productUrl.label" default="Product Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="productUrl" required="" value="${dataInstance?.productUrl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: dataInstance, field: 'white70PxImgUrl', 'error')} required">
	<label for="white70PxImgUrl">
		<g:message code="data.white70PxImgUrl.label" default="White70 Px Img Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="white70PxImgUrl" required="" value="${dataInstance?.white70PxImgUrl}"/>

</div>

