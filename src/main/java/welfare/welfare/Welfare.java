package welfare.welfare;

import org.bukkit.plugin.java.JavaPlugin;
import welfare.welfare.commands.*;
import welfare.welfare.event.*;

import java.util.Objects;
// Licensed to the Apache Software Foundation (ASF) under one or more
// contributor license agreements.  See the NOTICE file distributed with
// this work for additional information regarding copyright ownership.
// The ASF licenses this file to You under the Apache License, Version 2.0
// (the "License"); you may not use this file except in compliance with
// the License.  You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

public final class Welfare extends JavaPlugin {

    @Override
    public void onEnable() {
        // 启动插件

        // 添加事件
        getServer().getPluginManager().registerEvents(new bfoldGui(),this);
        getServer().getPluginManager().registerEvents(new bfnewGui(),this);
        getServer().getPluginManager().registerEvents(new musicgui(),this);
        getServer().getPluginManager().registerEvents(new killgui(),this);
        getServer().getPluginManager().registerEvents(new GithubGui(),this);
        getServer().getPluginManager().registerEvents(new verGui(),this);
        //添加命令
        Objects.requireNonNull(getCommand("welbfo")).setExecutor(new bfold());
        Objects.requireNonNull(getCommand("welver")).setExecutor(new version());
        Objects.requireNonNull(getCommand("welgui")).setExecutor(new playergui());
        Objects.requireNonNull(getCommand("welmusic")).setExecutor(new welmusic());
        Objects.requireNonNull(getCommand("welhelp")).setExecutor(new welhelp());
        Objects.requireNonNull(getCommand("wel404")).setExecutor(new wel404());
        Objects.requireNonNull(getCommand("welkill")).setExecutor(new wel404());
        Objects.requireNonNull(getCommand("welGithub")).setExecutor(new Github());
        Objects.requireNonNull(getCommand("welbfn")).setExecutor(new bfnew());
    }

    @Override
    public void onDisable() {
        // 卸载插件
    }
}
