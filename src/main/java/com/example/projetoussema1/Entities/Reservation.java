package com.example.projetoussema1.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Reservation")
public class Reservation {

        private String id;
        private String reservationName;
        private String description;
        private Date startDate;
        private Date endDate;
        private String status;

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public String getReservationName() {
                return reservationName;
        }

        public void setReservationName(String reservationName) {
                this.reservationName = reservationName;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public Date getStartDate() {
                return startDate;
        }

        public void setStartDate(Date startDate) {
                this.startDate = startDate;
        }

        public Date getEndDate() {
                return endDate;
        }

        public void setEndDate(Date endDate) {
                this.endDate = endDate;
        }

        public String getStatus() {
                return status;
        }

        public void setStatus(String status) {
                this.status = status;
        }

        public Reservation(String id, String reservationName, String description, Date startDate, Date endDate, String status) {
                this.id = id;
                this.reservationName = reservationName;
                this.description = description;
                this.startDate = startDate;
                this.endDate = endDate;
                this.status = status;
        }
}