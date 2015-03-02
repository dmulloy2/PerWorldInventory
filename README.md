PerWorldInventory
=================
Made by Gnat008, for Spigot 1.8.
Version: 1.2.1

Introduction
=================
I wrote this plugin not long before name changing went live, when I realized that MultiVerse-Inventories had not been updated to use UUID's. We've been using this on our server for a few months now, and I decided to share it with all of you as well. This is also why the first version on here is 1.1.0.

Description
=================
The way this plugin stores data is fundamentally different from MultiVerse-Inventories. Like MV-I, this plugin saves data in a .json format, but that is where the similarities end. Not only does this save your inventory, it saves your stats as well! This includes things like active potion effects, exp, level, and more. These all can be configured on a per-item basis, should you not want all of these saved. See the Configuration section below for these. All commands can be seen ingame with the '/pwi help' command.

Installation
=================
Like all plugins, drop the .jar in your plugins folder, and restart the server to generate the necessary files.

Configuration
=================
Pretty straightforward, turning the options to false will cause that item to not be saved.
NOTE: If you change 'first-start' to 'true', all of your configurations will be reset to default! This setting is not meant to be changed, and exists for certain things during the first start.


Next you configure your groups in the worlds.yml file. The format here is groups: >> group name >> list of worlds in that group. Worlds in the same group will all share the same inventory and stats.

Once you have made your desired changes, simply type /pwi reload. That's it! You're done!

A 'default.json' file is provided in case a player goes to a world that is not found in your worlds.yml file. In that event, the contents of this file will be loaded, which is a blank inventory with no levels and full health. If you know what you are doing, you can change this to a custom setup. In the future, a command will be implemented to change this.

Conversion
=================
If you are converting from MV-I, simply run the "/pwi convert" command and the plugin will take care of everything. You must have MV-I running for this. Keep in mind, converting only works with MV-I version 2.5, it will not work on 2.4. When MV-I is updated from 2.4 to 2.5, it switches from yml to json files, but does not convert the data until it is used. Be sure to keep your MV-I data around, just in case something does go wrong.
