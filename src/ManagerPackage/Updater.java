package src.ManagerPackage;
import src.FacilityPackage.*;
import java.util.Date;
public class Updater {
    FacilityTracker facTracker;
    UsageManager useManager;
    MaintenanceManager maintManager;
    ScheduleManager scheduleManager;
    Date currentDate;

    public Updater(FacilityTracker facTracker, UsageManager useManager, MaintenanceManager maintManager, ScheduleManager scheduleManager) {
        this.facTracker = facTracker;
        this.useManager = useManager;
        this.maintManager = maintManager;
        this.scheduleManager = scheduleManager;
    }

    public void updateTime(Date newDate){
        currentDate = newDate;
        maintManager.update(currentDate);
        useManager.update(currentDate);
    }

    public void newFacility(Facility newFac){
        useManager.updateFacilities(newFac);
        maintManager.updateFacilities(newFac);
        scheduleManager.updateFacilities(newFac);
    }

}
