package asia.zrc.learn.thread;

import org.omg.CORBA.Request;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zrc on 2017/5/1.
 */
public class LifeCyclWebServer {
    //newFixedThreadPool 创建指定数量的线程，每来一个就创建一个，知道到最大线程
    //newCached 创建一个可以缓存的线程池，有空闲就回收，没有就添加，这个没有限制大小
    //newSingleThreadExecutor 创建一个单线程的任务，如果有异常会在创建一个，可以按照串行执行
    //newSheduledThreadPool 创建一个固定长度的线程，可以指定延迟或者定时执行。
    private final ExecutorService exec = Executors.newFixedThreadPool(200);

    public void start () throws IOException {
        ServerSocket socket = new ServerSocket(80);
        while (!exec.isShutdown()) {
            final Socket accept = socket.accept();
            exec.execute(new Runnable() {
                @Override
                public void run() {
                    handlerRequest(accept);
                }
            });
        }
    }

    private void handlerRequest(Socket accept) {
        Request req = readRequest(accept);
        if (isShutdownRequest(req)) {
            stop();
        }else {
            dispatchRequest(accept);
        }
    }

    private boolean isShutdownRequest(Request req) {
        return false;
    }

    private void stop() {
        exec.shutdown();
    }

    private void dispatchRequest(Socket accept) {
    }

    private Request readRequest(Socket accept) {
        return null;
    }
}
