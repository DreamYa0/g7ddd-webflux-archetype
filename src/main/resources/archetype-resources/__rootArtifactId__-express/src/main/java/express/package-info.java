#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * @author dreamyao
 * @title 领域分包，如当前分包为支付域
 * @date 2022/1/24 6:41 下午
 * @since 1.0.0
 */
package ${package}.express;
// 适配层（Adapter Layer）：负责对前端展示（web，wireless，wap）的路由和适配，对于传统B/S系统而言，adapter就相当于MVC中的controller.