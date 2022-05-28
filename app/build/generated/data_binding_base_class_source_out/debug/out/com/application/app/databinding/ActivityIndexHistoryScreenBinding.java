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
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.application.app.R;
import com.application.app.modules.indexhistoryscreen.data.viewmodel.IndexHistoryScreenVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityIndexHistoryScreenBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnSemua;

  @NonNull
  public final ConstraintLayout constraintButton;

  @NonNull
  public final ConstraintLayout constraintGroup226;

  @NonNull
  public final ConstraintLayout constraintGroup227;

  @NonNull
  public final ConstraintLayout constraintGroup23;

  @NonNull
  public final ConstraintLayout constraintGroup25;

  @NonNull
  public final ConstraintLayout constraintGroup27;

  @NonNull
  public final ConstraintLayout constraintGroup29;

  @NonNull
  public final ConstraintLayout constraintIndexhistoryS;

  @NonNull
  public final ConstraintLayout constraintRectangle171;

  @NonNull
  public final EditText etCariTransaksi;

  @NonNull
  public final ImageView imageGroup314;

  @NonNull
  public final ImageView imageGroup315;

  @NonNull
  public final ImageView imageIcons;

  @NonNull
  public final ImageView imageIcons1;

  @NonNull
  public final ImageView imageUser;

  @NonNull
  public final RecyclerView recyclerIndexHistoryScreen;

  @NonNull
  public final TextView txtAkun;

  @NonNull
  public final TextView txtArtikel;

  @NonNull
  public final TextView txtBeliin;

  @NonNull
  public final TextView txtBeranda;

  @NonNull
  public final TextView txtBerhasil;

  @NonNull
  public final TextView txtGagal;

  @NonNull
  public final TextView txtMenunggu;

  @NonNull
  public final TextView txtRiwayat;

  @NonNull
  public final TextView txtRiwayatTransak;

  @Bindable
  protected IndexHistoryScreenVM mIndexHistoryScreenVM;

  protected ActivityIndexHistoryScreenBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatButton btnSemua, ConstraintLayout constraintButton,
      ConstraintLayout constraintGroup226, ConstraintLayout constraintGroup227,
      ConstraintLayout constraintGroup23, ConstraintLayout constraintGroup25,
      ConstraintLayout constraintGroup27, ConstraintLayout constraintGroup29,
      ConstraintLayout constraintIndexhistoryS, ConstraintLayout constraintRectangle171,
      EditText etCariTransaksi, ImageView imageGroup314, ImageView imageGroup315,
      ImageView imageIcons, ImageView imageIcons1, ImageView imageUser,
      RecyclerView recyclerIndexHistoryScreen, TextView txtAkun, TextView txtArtikel,
      TextView txtBeliin, TextView txtBeranda, TextView txtBerhasil, TextView txtGagal,
      TextView txtMenunggu, TextView txtRiwayat, TextView txtRiwayatTransak) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnSemua = btnSemua;
    this.constraintButton = constraintButton;
    this.constraintGroup226 = constraintGroup226;
    this.constraintGroup227 = constraintGroup227;
    this.constraintGroup23 = constraintGroup23;
    this.constraintGroup25 = constraintGroup25;
    this.constraintGroup27 = constraintGroup27;
    this.constraintGroup29 = constraintGroup29;
    this.constraintIndexhistoryS = constraintIndexhistoryS;
    this.constraintRectangle171 = constraintRectangle171;
    this.etCariTransaksi = etCariTransaksi;
    this.imageGroup314 = imageGroup314;
    this.imageGroup315 = imageGroup315;
    this.imageIcons = imageIcons;
    this.imageIcons1 = imageIcons1;
    this.imageUser = imageUser;
    this.recyclerIndexHistoryScreen = recyclerIndexHistoryScreen;
    this.txtAkun = txtAkun;
    this.txtArtikel = txtArtikel;
    this.txtBeliin = txtBeliin;
    this.txtBeranda = txtBeranda;
    this.txtBerhasil = txtBerhasil;
    this.txtGagal = txtGagal;
    this.txtMenunggu = txtMenunggu;
    this.txtRiwayat = txtRiwayat;
    this.txtRiwayatTransak = txtRiwayatTransak;
  }

  public abstract void setIndexHistoryScreenVM(@Nullable IndexHistoryScreenVM indexHistoryScreenVM);

  @Nullable
  public IndexHistoryScreenVM getIndexHistoryScreenVM() {
    return mIndexHistoryScreenVM;
  }

  @NonNull
  public static ActivityIndexHistoryScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_index_history_screen, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityIndexHistoryScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityIndexHistoryScreenBinding>inflateInternal(inflater, R.layout.activity_index_history_screen, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityIndexHistoryScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_index_history_screen, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityIndexHistoryScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityIndexHistoryScreenBinding>inflateInternal(inflater, R.layout.activity_index_history_screen, null, false, component);
  }

  public static ActivityIndexHistoryScreenBinding bind(@NonNull View view) {
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
  public static ActivityIndexHistoryScreenBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityIndexHistoryScreenBinding)bind(component, view, R.layout.activity_index_history_screen);
  }
}
