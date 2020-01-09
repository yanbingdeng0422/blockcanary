package com.yanbing.blockcanary.lib;

import android.content.Context;

import com.yanbing.blockcanary.lib.internal.BlockInfo;

public interface BlockInterceptor {
    void onBlock(Context context, BlockInfo blockInfo);
}
