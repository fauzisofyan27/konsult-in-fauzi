// Generated by data binding compiler. Do not edit!
package com.application.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.application.app.R;
import com.application.app.modules.pilihkonsultan.data.viewmodel.PilihKonsultanVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityPilihKonsultanBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout constraintGroup178;

  @NonNull
  public final ConstraintLayout constraintPilihKonsultan;

  @NonNull
  public final ConstraintLayout constraintRectangle68;

  @NonNull
  public final EditText etCariKonsultan;

  @NonNull
  public final ImageView imageGroup65;

  @NonNull
  public final RecyclerView recyclerPilihKonsultan;

  @NonNull
  public final Toolbar toolbarToolbar;

  @NonNull
  public final TextView txtPersiapanKarir;

  @Bindable
  protected PilihKonsultanVM mPilihKonsultanVM;

  protected ActivityPilihKonsultanBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ConstraintLayout constraintGroup178,
      ConstraintLayout constraintPilihKonsultan, ConstraintLayout constraintRectangle68,
      EditText etCariKonsultan, ImageView imageGroup65, RecyclerView recyclerPilihKonsultan,
      Toolbar toolbarToolbar, TextView txtPersiapanKarir) {
    super(_bindingComponent, _root, _localFieldCount);
    this.constraintGroup178 = constraintGroup178;
    this.constraintPilihKonsultan = constraintPilihKonsultan;
    this.constraintRectangle68 = constraintRectangle68;
    this.etCariKonsultan = etCariKonsultan;
    this.imageGroup65 = imageGroup65;
    this.recyclerPilihKonsultan = recyclerPilihKonsultan;
    this.toolbarToolbar = toolbarToolbar;
    this.txtPersiapanKarir = txtPersiapanKarir;
  }

  public abstract void setPilihKonsultanVM(@Nullable PilihKonsultanVM pilihKonsultanVM);

  @Nullable
  public PilihKonsultanVM getPilihKonsultanVM() {
    return mPilihKonsultanVM;
  }

  @NonNull
  public static ActivityPilihKonsultanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_pilih_konsultan, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPilihKonsultanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityPilihKonsultanBinding>inflateInternal(inflater, R.layout.activity_pilih_konsultan, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityPilihKonsultanBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_pilih_konsultan, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPilihKonsultanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityPilihKonsultanBinding>inflateInternal(inflater, R.layout.activity_pilih_konsultan, null, false, component);
  }

  public static ActivityPilihKonsultanBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityPilihKonsultanBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityPilihKonsultanBinding)bind(component, view, R.layout.activity_pilih_konsultan);
  }
}
