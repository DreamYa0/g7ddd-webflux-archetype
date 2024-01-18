#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * @author dreamyao
 * @title
 * @date 2018/11/7 7:30 PM
 * @since 1.0.0
 */
package ${package}.application.demo.executor;
// 处理request、response，包括command和query 这里实现 CQRS架构设计（命令查询职责分离）执行命令
// 类以 CmdExec 结尾