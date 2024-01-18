#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.infra.dao.repository;

import ${package}.infra.dao.entity.OpLog;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

/**
 * @author dreamyao
 * @title
 * @date 2022/1/20 3:36 下午
 * @since 1.0.0
 */
public interface OpLogRepository extends R2dbcRepository<OpLog, Long> {

}
