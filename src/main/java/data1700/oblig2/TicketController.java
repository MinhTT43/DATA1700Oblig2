package data1700.oblig2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TicketController {

    private final List<Ticket> allTickets = new ArrayList<>();

    @PostMapping("/add")
    public void addNewTicket(Ticket innTicket) {
        allTickets.add(innTicket);
    }

    @GetMapping("/getAll")
    public List<Ticket> getAll() {
        return allTickets;
    }

    @PostMapping("/delete")
    public void deleteTicket(){
        allTickets.clear();
    }
}
