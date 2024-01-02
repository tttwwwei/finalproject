package com.yunyan.snake.ui.widget

/**
 * @description: 按键数据提供接口
 */
interface IKeyData {

    /**
     * 获取游戏状态
     */
    fun gameState(gameState: GameStateEnum)

    /**
     * 获取蛇头方向
     */
    fun direction(directionState: DirectionStateEnum)

}