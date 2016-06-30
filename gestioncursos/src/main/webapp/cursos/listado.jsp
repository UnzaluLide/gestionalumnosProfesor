<%@page import="com.ipartek.formacion.controller.Constantes"%>
<%@page import="com.ipartek.formacion.pojo.Curso"%>
<%@page import="java.util.List"%>
<jsp:include page="../includes/header.jsp"/> 
<main>
		<a href="index.jsp">Atras</a>
		<a href="<%=Constantes.SERVLET_CURSOS+"?"+Constantes.PAR_CODIGO+"="+Curso.CODIGO_CURSO%>">A�adir Curso Nuevo</a> 
		
		
		<%		
			List<Curso> cursos = (List<Curso>) request.getAttribute("listado_cursos");
			if(cursos!=null){
				int i=1;
				String formulario ="";
				for(Curso curso: cursos){
					formulario = "<form action='"+Constantes.SERVLET_CURSOS
							+"' method='post'>";
					//la variable opercion
					formulario +="<input type='hidden' "+
							"name='"+Constantes.PAR_OPERACION+
							"' value='"+Constantes.OP_DELETE+"'/>";
					//la variable del codigo del curso
					formulario +="<input type='hidden' "+
							"name='"+Constantes.PAR_CODIGO+
							"' value='"+curso.getCodigo()+"'/>";
					//el boton de borrar
					formulario +="<input type='submit' value='Borrar'";
					formulario +="</form>";
					out.write("<div><a href='cursos.do?"+Constantes.PAR_CODIGO
							+"=" + curso.getCodigo() + "'>Curso " + i + ": " 
							+ curso.getNombre() + "</a>"+formulario+"</div>");
					i++;
				}
			}
		%>
</main>
<%@ include file="../includes/footer.jsp" %>