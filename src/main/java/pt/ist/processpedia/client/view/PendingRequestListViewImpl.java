package pt.ist.processpedia.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;

import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiBinder;

public class PendingRequestListViewImpl extends Composite implements PendingRequestListView {

  public interface PendingRequestListViewImplUiBinder extends UiBinder<Widget, PendingRequestListViewImpl> {}
  private static PendingRequestListViewImplUiBinder uiBinder = GWT.create(PendingRequestListViewImplUiBinder.class);

  @UiField
  HasWidgets pendingRequestsContainer;

  public PendingRequestListViewImpl() {
    initWidget(uiBinder.createAndBindUi(this));
		pendingRequestsContainer.add(new Label("OLA"));
  }

}                                                                                                                      





