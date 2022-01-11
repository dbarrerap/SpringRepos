package io.github.dbarrerap.photorepos.api;

import io.github.dbarrerap.photorepos.services.ScheduledTaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedule")
public class ScheduledTaskController {
    private final ScheduledTaskService scheduledTaskService;

    public ScheduledTaskController(ScheduledTaskService scheduledTaskService) {
        this.scheduledTaskService = scheduledTaskService;
    }

    @GetMapping("/activate")
    public void activateScheduledTask() {
        scheduledTaskService.activate();
    }

//    @GetMapping("/filternull")
//    public void deleteNulls() {
//        scheduledTaskService.deleteNoName();
//    }

    public void getName() {
        scheduledTaskService.deleteByName();
    }
}
