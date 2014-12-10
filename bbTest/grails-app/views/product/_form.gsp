<%@ page import="org.bb.domain.Product" %>



<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'data', 'error')} ">
	<label for="data">
		<g:message code="product.data.label" default="Data" />
		
	</label>
	<g:select name="data" from="${org.bb.domain.Data.list()}" multiple="multiple" optionKey="id" size="5" value="${productInstance?.data*.id}" class="many-to-many"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'err_msg', 'error')} required">
	<label for="err_msg">
		<g:message code="product.err_msg.label" default="Errmsg" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="err_msg" required="" value="${productInstance?.err_msg}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'ret_code', 'error')} required">
	<label for="ret_code">
		<g:message code="product.ret_code.label" default="Retcode" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="ret_code" required="" value="${productInstance?.ret_code}"/>

</div>

