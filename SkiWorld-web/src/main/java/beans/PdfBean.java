package beans;

import java.io.OutputStream;
import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.xhtmlrenderer.pdf.ITextRenderer;




@ManagedBean
@ApplicationScoped
public class PdfBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public void createPdf(){

		
		 FacesContext facesContext = FacesContext.getCurrentInstance();
		    ExternalContext externalContext = facesContext.getExternalContext();
		    HttpSession session = (HttpSession) externalContext.getSession(true);
		    String url = "http://localhost:18080/SkiWorld-web/pages/cart/pdf.jsf;JSESSIONID=" + session.getId();
		    try {
		    ITextRenderer renderer = new ITextRenderer();
		    renderer.setDocument(url);
		    renderer.layout();
		    HttpServletResponse response = (HttpServletResponse) externalContext.getResponse();
		    response.reset();
		    response.setContentType("application/pdf");
		    response.setHeader("Content-Disposition","C://first.pdf");
		    OutputStream browserStream = response.getOutputStream();
		    renderer.createPDF(browserStream);
		    browserStream.close();
		    session.invalidate();
		    } catch (Exception ex) {
		       ex.printStackTrace();
		    }
		    facesContext.responseComplete();
		
		
	}
	
	public String goSuccess(){
		String navTo = "http://localhost:18080/SkiWorld-web/pages/cart/success.jsf";
		return navTo;
	}
	
}
