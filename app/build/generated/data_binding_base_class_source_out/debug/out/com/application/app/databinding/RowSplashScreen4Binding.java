// Generated by data binding compiler. Do not edit!
package com.application.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.application.app.R;
import com.application.app.modules.splashscreen3.data.model.SplashScreen4RowModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RowSplashScreen4Binding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout constraintGroup;

  @NonNull
  public final ImageView imageVector;

  @NonNull
  public final ImageView imageVector1;

  @NonNull
  public final ImageView imageVector2;

  @NonNull
  public final ImageView imageVector3;

  @Bindable
  protected SplashScreen4RowModel mSplashScreen4RowModel;

  protected RowSplashScreen4Binding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout constraintGroup, ImageView imageVector, ImageView imageVector1,
      ImageView imageVector2, ImageView imageVector3) {
    super(_bindingComponent, _root, _localFieldCount);
    this.constraintGroup = constraintGroup;
    this.imageVector = imageVector;
    this.imageVector1 = imageVector1;
    this.imageVector2 = imageVector2;
    this.imageVector3 = imageVector3;
  }

  public abstract void setSplashScreen4RowModel(
      @Nullable SplashScreen4RowModel splashScreen4RowModel);

  @Nullable
  public SplashScreen4RowModel getSplashScreen4RowModel() {
    return mSplashScreen4RowModel;
  }

  @NonNull
  public static RowSplashScreen4Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_splash_screen_4, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowSplashScreen4Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowSplashScreen4Binding>inflateInternal(inflater, R.layout.row_splash_screen_4, root, attachToRoot, component);
  }

  @NonNull
  public static RowSplashScreen4Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_splash_screen_4, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowSplashScreen4Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowSplashScreen4Binding>inflateInternal(inflater, R.layout.row_splash_screen_4, null, false, component);
  }

  public static RowSplashScreen4Binding bind(@NonNull View view) {
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
  public static RowSplashScreen4Binding bind(@NonNull View view, @Nullable Object component) {
    return (RowSplashScreen4Binding)bind(component, view, R.layout.row_splash_screen_4);
  }
}