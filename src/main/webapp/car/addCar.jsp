 <div class="col-lg-12">
    <h4>Register new Vehicle Details</h4>
    <form class="form-horizontal" enctype="multipart/form-data" method="POST" action="./carfileUpload">

           <div class="form-group">
            <label for="inputVehicle1" class="col-sm-2 control-label">Vehicle Name*</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle1" name="carName" placeholder="vehicle nickname" required="">
            </div>
        </div>


        <div class="form-group">
            <label for="inputVehicle13"  class="col-sm-2 control-label">Owner</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle13" name="carOwner" placeholder="Vehicle Owner" required="">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle2"  class="col-sm-2 control-label">VIN/SN</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="inputVehicle2" name="carVIN" placeholder="Vehicle Identification No" required="">
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle3"  class="col-sm-2 control-label">Type</label>
            <div class="col-sm-3">
                <%--<input type="text" class="form-control" name="carType" id="inputVehicle3" placeholder="vehicle type e.g. Bus">--%>
                <select class="form-control" name="carType" id="inputVehicle3">
                    <option>Saloon</option>
                    <option>Sport Car</option>
                    <option>Pople Mover</option>
                    <option>Compact SUV</option>
                    <option>Medium SUV</option>
                    <option>Large SUV</option>
                    <option>Lorry and Trellar</option>

                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle4"  class="col-sm-2 control-label">Year</label>
            <div class="col-sm-3">
                <%--<input type="date" class="form-control" name="carYear" id="inputVehicle4" placeholder="Vehicle manufactured year">--%>
                <select class="form-control" name="carYear" id="inputVehicle4">
                    <option>2005</option>
                    <option>2006</option>
                    <option>2007</option>
                    <option>2008</option>
                    <option>2009</option>
                    <option>2010</option>
                    <option>2011</option>
                    <option>2012</option>
                    <option>2013</option>
                    <option>2014</option>
                    <option>2015</option>
                    <option>2016</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle5" class="col-sm-2 control-label">Make</label>
            <div class="col-sm-3">
               <%-- <input type="text" class="form-control" name="carMake" id="inputVehicle5" placeholder="e.g Toyota">--%>
                <select class="form-control" name="carMake" id="inputVehicle5">
                    <option>Toyota</option>
                    <option>Mazda</option>
                    <option>Daihatsu</option>
                    <option>Aston Martin</option>
                    <option>Cadillac</option>
                    <option>Isuzu</option>
                    <option>Chevrolet</option>

                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle6"  class="col-sm-2 control-label">Model</label>
            <div class="col-sm-3">
                <%--<input type="text" class="form-control" name="carModel" id="inputVehicle6" placeholder="e.g Salon">--%>
                <select class="form-control" name="carModel" id="inputVehicle6">
                    <option>Toyota 4Runner </option>
                    <option>Toyota 86</option>
                    <option>Toyota Agya</option>
                    <option>Toyota Allion</option>
                    <option>Toyota Alphard </option>
                    <option>Toyota Aurion </option>
                    <option>Toyota Coaster </option>
                    <option>Toyota Heavy Duty Truck </option>
                    <option>Toyota Hiace  </option>
                    <option>Ford 2GA </option>
                    <option>Ford Cougar </option>
                    <option>Ford Executive </option>
                    <option>Ford Futura </option>
                    <option>Ford GTX1 </option>

                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle7"  class="col-sm-2 control-label">Licence Plate</label>
            <div class="col-sm-8">
                <input type="text" class="form-control"name="carLicence"  id="inputVehicle7" placeholder="e.g KBL 557H">
            </div>
        </div>
        <div class="form-group">
            <label for="inputVehicle8" class="col-sm-2 control-label">Registration Town</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" name="carRegistrationTown" id="inputVehicle8" placeholder="e.g Nairobi">
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle10"  class="col-sm-2 control-label">Vehicle Color</label>
            <div class="col-sm-8">
                <input type="text" name="carColor" class="form-control" name="carVIN" id="inputVehicle10" placeholder="e.g Red">
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle11" class="col-sm-2 control-label">MSRP</label>
            <div class="col-sm-8 input-group">
                <span class="input-group-addon">$$</span>
                <input type="text" class="form-control" name="carMSRP" placeholder="Manufacturer Suggested Resale Price" id="inputVehicle11" required="">
            </div>
        </div>
       <%-- <div class="form-group">
            <label for="inputVehicle12"  class="col-sm-2 control-label">Comments</label>
            <div class="col-sm-8">
                <input type="textarea" class="form-control" name="carType"  id="inputVehicle12" placeholder="Manufacturer Suggested Resele Price">
            </div>
        </div>--%>
<h4>Additional Details</h4>
        <div class="form-group">
            <label for="inputVehicle12" class="col-sm-2 control-label">Comment:</label>
            <div class="col-sm-8">
            <textarea class="form-control" rows="3" name="carComments" id="inputVehicle12"></textarea>
            </div>
        </div>

        <div class="form-group">
            <label for="inputVehicle9" name="carPhoto" class="col-sm-2 control-label">Photo</label>
            <div class="col-sm-8">
                <input type="file"  name="carPhoto" id="inputVehicle9" >
            </div>
        </div>

       <%-- <div class="btn-group open">
            <a class="btn btn-primary" href="#"><i class="fa fa-user fa-fw"></i> User</a>
            <a class="btn btn-primary dropdown-toggle" data-toggle="dropdown" href="#">
                <span class="fa fa-caret-down" title="Toggle dropdown menu"></span>
            </a>
            <ul class="dropdown-menu">
                <li><a href="#"><i class="fa fa-pencil fa-fw"></i> Edit</a></li>
                <li><a href="#"><i class="fa fa-trash-o fa-fw"></i> Delete</a></li>
                <li><a href="#"><i class="fa fa-ban fa-fw"></i> Ban</a></li>
                <li class="divider"></li>
                <li><a href="#"><i class="fa fa-unlock"></i> Make admin</a></li>
            </ul>
        </div>--%>




<div class="col-lg-12">
<button type="submit" class="btn btn-success pull-right">Save</button>
</div>


    </form>


</div>

