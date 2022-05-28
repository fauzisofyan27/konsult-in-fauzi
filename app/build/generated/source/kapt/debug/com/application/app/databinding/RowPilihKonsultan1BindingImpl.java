package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowPilihKonsultan1BindingImpl extends RowPilihKonsultan1Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageRectangle122, 8);
        sViewsWithIds.put(R.id.constraintGroup181, 9);
        sViewsWithIds.put(R.id.btnChatSekarang, 10);
        sViewsWithIds.put(R.id.constraintGroup180, 11);
        sViewsWithIds.put(R.id.constraintReview, 12);
        sViewsWithIds.put(R.id.imageReviewBintang, 13);
        sViewsWithIds.put(R.id.viewEllipse7, 14);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowPilihKonsultan1BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private RowPilihKonsultan1BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.view.View) bindings[14]
            );
        this.constraintGroup.setTag(null);
        this.imageEllipse6.setTag(null);
        this.txt4929.setTag(null);
        this.txtBiayaKonsultas.setTag(null);
        this.txtPersiapanKarir.setTag(null);
        this.txtRicardArchiSa.setTag(null);
        this.txtRp5000060.setTag(null);
        this.txtUniversitasIst.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.pilihKonsultan1RowModel == variableId) {
            setPilihKonsultan1RowModel((com.application.app.modules.pilihkonsultan.data.model.PilihKonsultan1RowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPilihKonsultan1RowModel(@Nullable com.application.app.modules.pilihkonsultan.data.model.PilihKonsultan1RowModel PilihKonsultan1RowModel) {
        this.mPilihKonsultan1RowModel = PilihKonsultan1RowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.pilihKonsultan1RowModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String pilihKonsultan1RowModelTxtBiayaKonsultas = null;
        java.lang.String pilihKonsultan1RowModelTxtPersiapanKarir = null;
        java.lang.String pilihKonsultan1RowModelTxtRicardArchiSa = null;
        java.lang.String pilihKonsultan1RowModelTxt4929 = null;
        java.lang.String pilihKonsultan1RowModelTxtUniversitasIst = null;
        java.lang.String pilihKonsultan1RowModelTxtRp5000060 = null;
        com.application.app.modules.pilihkonsultan.data.model.PilihKonsultan1RowModel pilihKonsultan1RowModel = mPilihKonsultan1RowModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (pilihKonsultan1RowModel != null) {
                    // read pilihKonsultan1RowModel.txtBiayaKonsultas
                    pilihKonsultan1RowModelTxtBiayaKonsultas = pilihKonsultan1RowModel.getTxtBiayaKonsultas();
                    // read pilihKonsultan1RowModel.txtPersiapanKarir
                    pilihKonsultan1RowModelTxtPersiapanKarir = pilihKonsultan1RowModel.getTxtPersiapanKarir();
                    // read pilihKonsultan1RowModel.txtRicardArchiSa
                    pilihKonsultan1RowModelTxtRicardArchiSa = pilihKonsultan1RowModel.getTxtRicardArchiSa();
                    // read pilihKonsultan1RowModel.txt4929
                    pilihKonsultan1RowModelTxt4929 = pilihKonsultan1RowModel.getTxt4929();
                    // read pilihKonsultan1RowModel.txtUniversitasIst
                    pilihKonsultan1RowModelTxtUniversitasIst = pilihKonsultan1RowModel.getTxtUniversitasIst();
                    // read pilihKonsultan1RowModel.txtRp5000060
                    pilihKonsultan1RowModelTxtRp5000060 = pilihKonsultan1RowModel.getTxtRp5000060();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageEllipse6, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageEllipse6.getContext(), R.drawable.img_ellipse6), (float)0f, true);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt4929, pilihKonsultan1RowModelTxt4929);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBiayaKonsultas, pilihKonsultan1RowModelTxtBiayaKonsultas);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPersiapanKarir, pilihKonsultan1RowModelTxtPersiapanKarir);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRicardArchiSa, pilihKonsultan1RowModelTxtRicardArchiSa);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRp5000060, pilihKonsultan1RowModelTxtRp5000060);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtUniversitasIst, pilihKonsultan1RowModelTxtUniversitasIst);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): pilihKonsultan1RowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}