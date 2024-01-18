#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * @author dreamyao
 * @title
 * @date 2022/1/24 6:41 下午
 * @since 1.0.0
 */
package ${package}.application;
// 应用层（Application Layer）：主要负责获取输入，组装上下文，参数校验，调用领域层做业务处理，如果需要的话，发送消息通知等。
// 层次是开放的，应用层也可以绕过领域层，直接访问基础实施层