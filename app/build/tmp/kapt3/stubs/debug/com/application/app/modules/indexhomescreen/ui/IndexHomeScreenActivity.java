package com.application.app.modules.indexhomescreen.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0013J\u001e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u000bH\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/application/app/modules/indexhomescreen/ui/IndexHomeScreenActivity;", "Lcom/application/app/appcomponents/base/BaseActivity;", "Lcom/application/app/databinding/ActivityIndexHomeScreenBinding;", "()V", "viewModel", "Lcom/application/app/modules/indexhomescreen/data/viewmodel/IndexHomeScreenVM;", "getViewModel", "()Lcom/application/app/modules/indexhomescreen/data/viewmodel/IndexHomeScreenVM;", "viewModel$delegate", "Lkotlin/Lazy;", "onClickRecyclerGroup98", "", "view", "Landroid/view/View;", "position", "", "item", "Lcom/application/app/modules/indexhomescreen/data/model/IndexHomeScreen2RowModel;", "onClickRecyclerIndexHomeScreen", "Lcom/application/app/modules/indexhomescreen/data/model/IndexHomeScreen1RowModel;", "onClickRecyclerKatalog", "Lcom/application/app/modules/indexhomescreen/data/model/IndexHomeScreen3RowModel;", "onInitialized", "setUpClicks", "Companion", "app_debug"})
public final class IndexHomeScreenActivity extends com.application.app.appcomponents.base.BaseActivity<com.application.app.databinding.ActivityIndexHomeScreenBinding> {
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.application.app.modules.indexhomescreen.ui.IndexHomeScreenActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "INDEX_HOME_SCREEN_ACTIVITY";
    
    public IndexHomeScreenActivity() {
        super(0);
    }
    
    private final com.application.app.modules.indexhomescreen.data.viewmodel.IndexHomeScreenVM getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onInitialized() {
    }
    
    @java.lang.Override()
    public void setUpClicks() {
    }
    
    public final void onClickRecyclerIndexHomeScreen(@org.jetbrains.annotations.NotNull()
    android.view.View view, int position, @org.jetbrains.annotations.NotNull()
    com.application.app.modules.indexhomescreen.data.model.IndexHomeScreen1RowModel item) {
    }
    
    public final void onClickRecyclerGroup98(@org.jetbrains.annotations.NotNull()
    android.view.View view, int position, @org.jetbrains.annotations.NotNull()
    com.application.app.modules.indexhomescreen.data.model.IndexHomeScreen2RowModel item) {
    }
    
    public final void onClickRecyclerKatalog(@org.jetbrains.annotations.NotNull()
    android.view.View view, int position, @org.jetbrains.annotations.NotNull()
    com.application.app.modules.indexhomescreen.data.model.IndexHomeScreen3RowModel item) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/application/app/modules/indexhomescreen/ui/IndexHomeScreenActivity$Companion;", "", "()V", "TAG", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "bundle", "Landroid/os/Bundle;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        android.os.Bundle bundle) {
            return null;
        }
    }
}