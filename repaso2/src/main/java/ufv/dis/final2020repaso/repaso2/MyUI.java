package ufv.dis.final2020repaso.repaso2;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	
    	Lista list = new Lista();
    	
        final VerticalLayout layout = new VerticalLayout();
        
        final TextField name = new TextField();
        name.setCaption("Type product name here:");
        
        final TextField categ = new TextField();
        categ.setCaption("Type cathegory here:");
        
        final TextField price = new TextField();
        price.setCaption("Type price here:");
        
        final TextField ean = new TextField();
        ean.setCaption("Type ean here:");

        Button button = new Button("Click Me");
        button.addClickListener(e -> {
        	
        	Producto p = new Producto(name.getValue(), categ.getValue(), Integer.parseInt(price.getValue()), ean.getValue());
            layout.addComponent(new Label("product " + p.getNombre() 
                    + "registered correctly"));
            
            list.addProducto(p);
            
            generadorEAN.generador(p);
            
        });
        
        layout.addComponents(name, categ, price, ean,  button);
        
        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
