package pt.ist.processpedia.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class FooterViewImpl extends Composite implements FooterView {

  public interface FooterViewImplUiBinder extends UiBinder<Widget, FooterViewImpl> {}
  private static FooterViewImplUiBinder uiBinder = GWT.create(FooterViewImplUiBinder.class);

  public FooterViewImpl() {
    initWidget(uiBinder.createAndBindUi(this));
  }

}