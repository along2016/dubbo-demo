package com.aliang.provider.multithreading;

public class SystemMonitor {

    private Thread t;

    private boolean stop = false;

    public void start(){
        t = new Thread(() -> {
            while (!stop){
                System.out.println("正在监控系统...");
                try {
                    Thread.sleep(3 * 1000L);
                    System.out.println("任务执行 3 秒");
                    System.out.println("监控的系统正常!");
                } catch (InterruptedException e) {
                    System.out.println("任务执行被中断...");
                    Thread.currentThread().interrupt(); //重新设置线程为中断状态
                }
            }
        });
        t.start();
    }

    public void stop(){
        stop = true;
        t.interrupt();
    }

    public static void main(String[] args) {
        SystemMonitor monitor = new SystemMonitor();
        monitor.start();

        try {
            //运行 10 秒后停止监控
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("监控任务启动 10 秒后，停止...");
        monitor.stop();
    }
}
