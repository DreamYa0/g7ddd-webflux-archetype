#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.express;

import org.springframework.boot.SpringApplication;
import reactor.tools.agent.ReactorDebugAgent;
import reactor.core.scheduler.Schedulers;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dreamyao
 * @title
 * @date 2018/8/25 下午1:00
 * @since 1.0.0
 */
@SpringBootApplication(scanBasePackages = {"com.*"})
public class Application {

    public static void main(String[] args) {
        // 启动 reactor 全局调试模式，实现在加载类时对它们进行检测，但没有运行时性能开销
        ReactorDebugAgent.init();
        // 启用调度程序指标监控
        Schedulers.enableMetrics();
        SpringApplication.run(Application.class, args);
    }
}