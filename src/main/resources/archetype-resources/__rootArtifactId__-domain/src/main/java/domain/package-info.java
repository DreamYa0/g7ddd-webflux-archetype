#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * @author dreamyao
 * @title
 * @date 2022/1/24 6:49 下午
 * @since 1.0.0
 */
package ${package}.domain;
// 领域层（Domain Layer）：主要是封装了核心业务逻辑，并通过领域服务（Domain Service）和领域对象（Domain Entity）
// 的方法对App层提供业务实体和业务逻辑计算。领域是应用的核心，不依赖任何其他层次