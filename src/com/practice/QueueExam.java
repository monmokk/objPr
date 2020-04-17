package com.practice;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("ㅎㅇㅎㅇ", "명지"));
        messageQueue.offer(new Message("사랑해용", "지원"));
        messageQueue.offer(new Message("저듀용", "명지"));
        messageQueue.offer(new Message("쓸데없이 넘 많이 저장했네 ^^", "ㅁㅈ"));

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();

            switch (message.to) {
                case "명지":
                    System.out.println("명지에게 전송" + message.command);
                    break;
                case "지원":
                    System.out.println("지원에게 전송" + message.command);
                    break;
                default:
                    System.out.println("왜 이짓을.."+message.command);
                    break;
            }
        }
    }
}
