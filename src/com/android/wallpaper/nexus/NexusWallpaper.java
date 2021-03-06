/*
 * Copyright (C) 2009 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.wallpaper.nexus;

import com.android.wallpaper.RenderScriptWallpaper;
import com.android.wallpaper.RenderScriptScene;

public class NexusWallpaper extends RenderScriptWallpaper {
    static final String SHARED_PREFS_NAME = "nexus_settings";
    protected RenderScriptScene createScene(int width, int height) {
        return new NexusRS(this, width, height);
    }
}
