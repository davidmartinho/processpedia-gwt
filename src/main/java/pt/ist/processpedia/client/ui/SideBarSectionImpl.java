package pt.ist.processpedia.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class SideBarSectionImpl extends Composite implements SideBarSection {

  public interface SideBarSectionImplUiBinder extends UiBinder<Widget, SideBarSectionImpl> {}
  private static SideBarSectionImplUiBinder uiBinder = GWT.create(SideBarSectionImplUiBinder.class);

  public SideBarSectionImpl() {
    initWidget(uiBinder.createAndBindUi(this));
  }

}