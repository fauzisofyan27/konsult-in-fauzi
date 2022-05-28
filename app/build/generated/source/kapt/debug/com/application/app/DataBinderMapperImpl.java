package com.application.app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.application.app.databinding.ActivityIndexFiturKarirPlanningBindingImpl;
import com.application.app.databinding.ActivityIndexHistoryScreenBindingImpl;
import com.application.app.databinding.ActivityIndexHomeScreenBindingImpl;
import com.application.app.databinding.ActivityIndexShopScreenBindingImpl;
import com.application.app.databinding.ActivityPilihKonsultanBindingImpl;
import com.application.app.databinding.ActivitySplashScreen2BindingImpl;
import com.application.app.databinding.ActivitySplashScreen3BindingImpl;
import com.application.app.databinding.ActivitySplashScreenBindingImpl;
import com.application.app.databinding.LayoutProgressDialogBindingImpl;
import com.application.app.databinding.RowIndexFiturKarirPlanning1BindingImpl;
import com.application.app.databinding.RowIndexFiturKarirPlanning2BindingImpl;
import com.application.app.databinding.RowIndexFiturKarirPlanning3BindingImpl;
import com.application.app.databinding.RowIndexHistoryScreen1BindingImpl;
import com.application.app.databinding.RowIndexHomeScreen1BindingImpl;
import com.application.app.databinding.RowIndexHomeScreen2BindingImpl;
import com.application.app.databinding.RowIndexHomeScreen3BindingImpl;
import com.application.app.databinding.RowIndexShopScreen1BindingImpl;
import com.application.app.databinding.RowPilihKonsultan1BindingImpl;
import com.application.app.databinding.RowSplashScreen4BindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYINDEXFITURKARIRPLANNING = 1;

  private static final int LAYOUT_ACTIVITYINDEXHISTORYSCREEN = 2;

  private static final int LAYOUT_ACTIVITYINDEXHOMESCREEN = 3;

  private static final int LAYOUT_ACTIVITYINDEXSHOPSCREEN = 4;

  private static final int LAYOUT_ACTIVITYPILIHKONSULTAN = 5;

  private static final int LAYOUT_ACTIVITYSPLASHSCREEN = 6;

  private static final int LAYOUT_ACTIVITYSPLASHSCREEN2 = 7;

  private static final int LAYOUT_ACTIVITYSPLASHSCREEN3 = 8;

  private static final int LAYOUT_LAYOUTPROGRESSDIALOG = 9;

  private static final int LAYOUT_ROWINDEXFITURKARIRPLANNING1 = 10;

  private static final int LAYOUT_ROWINDEXFITURKARIRPLANNING2 = 11;

  private static final int LAYOUT_ROWINDEXFITURKARIRPLANNING3 = 12;

  private static final int LAYOUT_ROWINDEXHISTORYSCREEN1 = 13;

  private static final int LAYOUT_ROWINDEXHOMESCREEN1 = 14;

  private static final int LAYOUT_ROWINDEXHOMESCREEN2 = 15;

  private static final int LAYOUT_ROWINDEXHOMESCREEN3 = 16;

  private static final int LAYOUT_ROWINDEXSHOPSCREEN1 = 17;

  private static final int LAYOUT_ROWPILIHKONSULTAN1 = 18;

  private static final int LAYOUT_ROWSPLASHSCREEN4 = 19;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(19);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_index_fitur_karir_planning, LAYOUT_ACTIVITYINDEXFITURKARIRPLANNING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_index_history_screen, LAYOUT_ACTIVITYINDEXHISTORYSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_index_home_screen, LAYOUT_ACTIVITYINDEXHOMESCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_index_shop_screen, LAYOUT_ACTIVITYINDEXSHOPSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_pilih_konsultan, LAYOUT_ACTIVITYPILIHKONSULTAN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_splash_screen, LAYOUT_ACTIVITYSPLASHSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_splash_screen_2, LAYOUT_ACTIVITYSPLASHSCREEN2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_splash_screen_3, LAYOUT_ACTIVITYSPLASHSCREEN3);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.layout_progress_dialog, LAYOUT_LAYOUTPROGRESSDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.row_index_fitur_karir_planning1, LAYOUT_ROWINDEXFITURKARIRPLANNING1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.row_index_fitur_karir_planning2, LAYOUT_ROWINDEXFITURKARIRPLANNING2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.row_index_fitur_karir_planning3, LAYOUT_ROWINDEXFITURKARIRPLANNING3);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.row_index_history_screen1, LAYOUT_ROWINDEXHISTORYSCREEN1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.row_index_home_screen1, LAYOUT_ROWINDEXHOMESCREEN1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.row_index_home_screen2, LAYOUT_ROWINDEXHOMESCREEN2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.row_index_home_screen3, LAYOUT_ROWINDEXHOMESCREEN3);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.row_index_shop_screen1, LAYOUT_ROWINDEXSHOPSCREEN1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.row_pilih_konsultan1, LAYOUT_ROWPILIHKONSULTAN1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.row_splash_screen_4, LAYOUT_ROWSPLASHSCREEN4);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYINDEXFITURKARIRPLANNING: {
          if ("layout/activity_index_fitur_karir_planning_0".equals(tag)) {
            return new ActivityIndexFiturKarirPlanningBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_index_fitur_karir_planning is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYINDEXHISTORYSCREEN: {
          if ("layout/activity_index_history_screen_0".equals(tag)) {
            return new ActivityIndexHistoryScreenBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_index_history_screen is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYINDEXHOMESCREEN: {
          if ("layout/activity_index_home_screen_0".equals(tag)) {
            return new ActivityIndexHomeScreenBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_index_home_screen is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYINDEXSHOPSCREEN: {
          if ("layout/activity_index_shop_screen_0".equals(tag)) {
            return new ActivityIndexShopScreenBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_index_shop_screen is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPILIHKONSULTAN: {
          if ("layout/activity_pilih_konsultan_0".equals(tag)) {
            return new ActivityPilihKonsultanBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_pilih_konsultan is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASHSCREEN: {
          if ("layout/activity_splash_screen_0".equals(tag)) {
            return new ActivitySplashScreenBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash_screen is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASHSCREEN2: {
          if ("layout/activity_splash_screen_2_0".equals(tag)) {
            return new ActivitySplashScreen2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash_screen_2 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASHSCREEN3: {
          if ("layout/activity_splash_screen_3_0".equals(tag)) {
            return new ActivitySplashScreen3BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash_screen_3 is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTPROGRESSDIALOG: {
          if ("layout/layout_progress_dialog_0".equals(tag)) {
            return new LayoutProgressDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_progress_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWINDEXFITURKARIRPLANNING1: {
          if ("layout/row_index_fitur_karir_planning1_0".equals(tag)) {
            return new RowIndexFiturKarirPlanning1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_index_fitur_karir_planning1 is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWINDEXFITURKARIRPLANNING2: {
          if ("layout/row_index_fitur_karir_planning2_0".equals(tag)) {
            return new RowIndexFiturKarirPlanning2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_index_fitur_karir_planning2 is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWINDEXFITURKARIRPLANNING3: {
          if ("layout/row_index_fitur_karir_planning3_0".equals(tag)) {
            return new RowIndexFiturKarirPlanning3BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_index_fitur_karir_planning3 is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWINDEXHISTORYSCREEN1: {
          if ("layout/row_index_history_screen1_0".equals(tag)) {
            return new RowIndexHistoryScreen1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_index_history_screen1 is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWINDEXHOMESCREEN1: {
          if ("layout/row_index_home_screen1_0".equals(tag)) {
            return new RowIndexHomeScreen1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_index_home_screen1 is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWINDEXHOMESCREEN2: {
          if ("layout/row_index_home_screen2_0".equals(tag)) {
            return new RowIndexHomeScreen2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_index_home_screen2 is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWINDEXHOMESCREEN3: {
          if ("layout/row_index_home_screen3_0".equals(tag)) {
            return new RowIndexHomeScreen3BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_index_home_screen3 is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWINDEXSHOPSCREEN1: {
          if ("layout/row_index_shop_screen1_0".equals(tag)) {
            return new RowIndexShopScreen1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_index_shop_screen1 is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWPILIHKONSULTAN1: {
          if ("layout/row_pilih_konsultan1_0".equals(tag)) {
            return new RowPilihKonsultan1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_pilih_konsultan1 is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWSPLASHSCREEN4: {
          if ("layout/row_splash_screen_4_0".equals(tag)) {
            return new RowSplashScreen4BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_splash_screen_4 is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.asksira.loopingviewpager.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(20);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "indexFiturKarirPlanning1RowModel");
      sKeys.put(2, "indexFiturKarirPlanning2RowModel");
      sKeys.put(3, "indexFiturKarirPlanning3RowModel");
      sKeys.put(4, "indexFiturKarirPlanningVM");
      sKeys.put(5, "indexHistoryScreen1RowModel");
      sKeys.put(6, "indexHistoryScreenVM");
      sKeys.put(7, "indexHomeScreen1RowModel");
      sKeys.put(8, "indexHomeScreen2RowModel");
      sKeys.put(9, "indexHomeScreen3RowModel");
      sKeys.put(10, "indexHomeScreenVM");
      sKeys.put(11, "indexShopScreen1RowModel");
      sKeys.put(12, "indexShopScreenVM");
      sKeys.put(13, "message");
      sKeys.put(14, "pilihKonsultan1RowModel");
      sKeys.put(15, "pilihKonsultanVM");
      sKeys.put(16, "splashScreen2VM");
      sKeys.put(17, "splashScreen3VM");
      sKeys.put(18, "splashScreen4RowModel");
      sKeys.put(19, "splashScreenVM");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(19);

    static {
      sKeys.put("layout/activity_index_fitur_karir_planning_0", com.application.app.R.layout.activity_index_fitur_karir_planning);
      sKeys.put("layout/activity_index_history_screen_0", com.application.app.R.layout.activity_index_history_screen);
      sKeys.put("layout/activity_index_home_screen_0", com.application.app.R.layout.activity_index_home_screen);
      sKeys.put("layout/activity_index_shop_screen_0", com.application.app.R.layout.activity_index_shop_screen);
      sKeys.put("layout/activity_pilih_konsultan_0", com.application.app.R.layout.activity_pilih_konsultan);
      sKeys.put("layout/activity_splash_screen_0", com.application.app.R.layout.activity_splash_screen);
      sKeys.put("layout/activity_splash_screen_2_0", com.application.app.R.layout.activity_splash_screen_2);
      sKeys.put("layout/activity_splash_screen_3_0", com.application.app.R.layout.activity_splash_screen_3);
      sKeys.put("layout/layout_progress_dialog_0", com.application.app.R.layout.layout_progress_dialog);
      sKeys.put("layout/row_index_fitur_karir_planning1_0", com.application.app.R.layout.row_index_fitur_karir_planning1);
      sKeys.put("layout/row_index_fitur_karir_planning2_0", com.application.app.R.layout.row_index_fitur_karir_planning2);
      sKeys.put("layout/row_index_fitur_karir_planning3_0", com.application.app.R.layout.row_index_fitur_karir_planning3);
      sKeys.put("layout/row_index_history_screen1_0", com.application.app.R.layout.row_index_history_screen1);
      sKeys.put("layout/row_index_home_screen1_0", com.application.app.R.layout.row_index_home_screen1);
      sKeys.put("layout/row_index_home_screen2_0", com.application.app.R.layout.row_index_home_screen2);
      sKeys.put("layout/row_index_home_screen3_0", com.application.app.R.layout.row_index_home_screen3);
      sKeys.put("layout/row_index_shop_screen1_0", com.application.app.R.layout.row_index_shop_screen1);
      sKeys.put("layout/row_pilih_konsultan1_0", com.application.app.R.layout.row_pilih_konsultan1);
      sKeys.put("layout/row_splash_screen_4_0", com.application.app.R.layout.row_splash_screen_4);
    }
  }
}
