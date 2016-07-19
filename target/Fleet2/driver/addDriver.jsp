<div class="col-lg-12">
    <h4>Register new Drivers</h4>
    <form class="form-horizontal"  enctype="multipart/form-data">

        <div class="form-group">
            <label for="inputVehicle1" class="col-sm-2 control-label">First Name*</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputVehicle1" placeholder="first name">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle13" class="col-sm-2 control-label">Last Name</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputVehicle13" placeholder="last name">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle2" class="col-sm-2 control-label">ID Number</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputVehicle2" placeholder="ID nO">
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle3" class="col-sm-2 control-label">Region of Operation</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputVehicle3" placeholder="e.g Nairobi">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle4" class="col-sm-2 control-label">Vehicle Assigned</label>
            <div class="col-sm-10">
                <input type="date" class="form-control" id="inputVehicle4" placeholder="Vehicle Assigned">
            </div>
        </div>
        <h4>Address Details</h4>
        <div class="form-group">
            <label for="inputVehicle5" class="col-sm-2 control-label">Phone No</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputVehicle5" placeholder="phone number">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle6" class="col-sm-2 control-label">Email Address</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputVehicle6" placeholder="email">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle7" class="col-sm-2 control-label">City</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputVehicle7" placeholder="city">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle8" class="col-sm-2 control-label">Country</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputVehicle8" placeholder="country">
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle9" class="col-sm-2 control-label">Box</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputVehicle9" placeholder="Box">
            </div>
        </div>




       <%-- <div class="form-group">
            <label for="inputVehicle9" class="col-sm-2 control-label">Photo</label>
            <div class="col-sm-10">
                <input type="file"  id="inputVehicle9" >
            </div>
        </div>--%>


    </form>
    <div class="col-lg-12">
        <a class="btn btn-success"  onclick="driver.save()">Save</a>
    </div>
</div>