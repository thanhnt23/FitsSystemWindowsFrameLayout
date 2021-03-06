/**
 * Copyright 2016, KyoSherlock
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kyo.fitssystemwindows;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.WindowInsets;


/**
 * Created by jianghui on 6/21/16.
 */
@TargetApi(Build.VERSION_CODES.KITKAT_WATCH)
public class FitsSystemWindowsFrameLayout2CompatApi21 {


	public static int getBottomInset(Object insets) {
		return insets != null ? ((WindowInsets) insets).getSystemWindowInsetBottom() : 0;
	}

}
