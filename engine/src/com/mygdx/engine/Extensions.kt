package com.mygdx.engine

import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.scenes.scene2d.Actor

fun Actor.setPosition(position: Vector2) =
    setPosition(position.x, position.y)

val Actor.position: Vector2
    get() = Vector2(x, y)