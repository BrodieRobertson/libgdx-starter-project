# LibGDX Starter Project

This repository is intended to remove the need to write the classes that basically every game written with [libgdx](https://github.com/libgdx/libgdx) is going to need to contain. It was initially generated using the [BadLogic libgdx Setup App](https://libgdx.badlogicgames.com/download.html) with a desktop and android module with no extra libraries selected. If you need access to libraries like Box2D and do not know how to install them post project generation then this tool is available for you to use and if you still feel like this starter project works for what you plan to build then you can just copy these files over.

This repository is not intended to be a one size fits all solution. Projects that this may not fit perfectly with include:

+ Projects where you intend to use Event-Driven input handling
+ If you need Box2D or other libraries and do not know how to install them post project generation

## FAQ

+ Why have you used x, have you considered using y?

Any classes that I have decided to implement are included because I use them personally in my projects, however, if there's something that you feel would improve mine and everyone elses work flow feel free to submit an issue and/or a pull request about it.

+ Can you add x feature that I need for my game?

Short answer no, long answer is it specific to your game or is it a general feature that is used by many if not all games. If it's not then I'm more than willing to consider it, if it is then no, then I direct you back to my short answer.

+ Why implement a new Screen hierarchy when you could just use Scene2D?

Event handling is bloat and you don't need it also Scene2D includes a lot of extra features that you'll probably never and thus it makes more sense to write a slim and light weight screen class instead.

+ Why do you say that Event Handling is bloat?

Go learn how USB functions and how it differs from old standards like PS/2.

## Planned Additions

+ Data-Oriented Particle System
+ Game Data Provider
+ Sound Manager
