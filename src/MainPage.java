
import javax.swing.*;
import java.awt.*;

public class MainPage extends JFrame {
    private JPanel calendar;
    private JPanel reminder;
    private JPanel todoList;
    private JPanel puppy;

    public MainPage() {
        setTitle("메인 페이지");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // 4분할 레이아웃 생성
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(2, 2));

        // 상단 왼쪽 패널 - 캘린더 페이지
        JPanel calendarPanel = new JPanel();

        JButton calendarButton = new JButton("캘린더");
        calendarPanel.add(calendarButton);

        // 상단 오른쪽 패널 - 리마인더 페이지
        JPanel reminderPanel = new JPanel();

        reminderPanel.add(new JLabel("상단 오른쪽"));

        // 하단 왼쪽 패널 - 투두리스트 페이지
        JPanel todoListPanel = new JPanel();

        JButton todoListButton = new JButton("투두리스트");
        todoListPanel.add(todoListButton);

        // 하단 오른쪽 패널 - 강아지 페이지
        JPanel puppyPanel = new JPanel();

        puppyPanel.add(new JLabel("하단 오른쪽"));

        // 패널을 프레임에 추가
        contentPane.add(calendarPanel);
        contentPane.add(reminderPanel);
        contentPane.add(todoListPanel);
        contentPane.add(puppyPanel);

        // 캘린더 버튼 클릭 시 캘린더 페이지로 이동
//        calendarButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                CalendarPage calendarPage = new CalendarPage();
//                calendarPage.setVisible(true);
//            }
//        });
    }



//승민
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainPage().setVisible(true);
        });
    }
}
