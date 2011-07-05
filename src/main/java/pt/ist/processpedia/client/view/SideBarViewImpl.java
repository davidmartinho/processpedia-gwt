package pt.ist.processpedia.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class SideBarViewImpl extends Composite implements SideBarView {

  public interface SideBarViewImplUiBinder extends UiBinder<Widget, SideBarViewImpl> {}
  private static SideBarViewImplUiBinder uiBinder = GWT.create(SideBarViewImplUiBinder.class);

  public SideBarViewImpl() {
    initWidget(uiBinder.createAndBindUi(this));
  }

}