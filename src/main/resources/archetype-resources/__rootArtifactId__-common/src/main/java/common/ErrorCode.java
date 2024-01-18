#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.common;

import com.g7.framework.framwork.exception.meta.CodeMeta;
/**
 * @author dreamyao
 * @title 统一异常 code 定义
 * @date 2018/8/25 下午4:26
 * @since 1.0.0
 */
public class ErrorCode {

    /**
     * SUCCESS
     */
    public static final CodeMeta SUCCESS = new CodeMeta("10000", "SUCCESS", "成功","success");
    /**
     * 入参错误
     */
    public static final CodeMeta PARAM_ERROR = new CodeMeta("20000", "ERROR", "入参错误","param error");

}
