package pt.ist.processpedia.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ContentViewImpl extends Composite implements ContentView {

  public interface ContentViewImplUiBinder extends UiBinder<Widget, ContentViewImpl> {}
  private static ContentViewImplUiBinder uiBinder = GWT.create(ContentViewImplUiBinder.class);

  public ContentViewImpl() {
    initWidget(uiBinder.createAndBindUi(this));
  }

}