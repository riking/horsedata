Horsedata
=========

A Bukkit plugin that gives stats about your horses in Minecraft.

Usage
====
 - *(Player only)* **/horse** (alias **/h**) - Report information about the horse near you.
 - *(Console and Player)* **/horse <player>** - Report information about the horse near that player.

No permissions are used.

How it finds the horse "Near You"
========
The plugin searches for horses 10 blocks or less from you meeting these criteria:
 1. If you are riding the horse, stop and use that one.
 2. Horses you are holding the leash for have priority.
 3. The closest horse is selected.

The plugin presents the information like this:
