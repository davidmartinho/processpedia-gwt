package pt.ist.processpedia.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class HeaderViewImpl extends Composite implements HeaderView {

  public interface HeaderViewImplUiBinder extends UiBinder<Widget, HeaderViewImpl> {}
  private static HeaderViewImplUiBinder uiBinder = GWT.create(HeaderViewImplUiBinder.class);

  public HeaderViewImpl() {
    initWidget(uiBinder.createAndBindUi(this));
  }

}