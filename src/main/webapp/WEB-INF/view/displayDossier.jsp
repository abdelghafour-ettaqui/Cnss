<%@ page import="entities.Medicament" %><%--
  Created by IntelliJ IDEA.
  User: linsen
  Date: 12/7/22
  Time: 6:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.3/dist/flowbite.min.css" />
    <script src="https://unpkg.com/flowbite@1.5.3/dist/flowbite.js"></script>
</head>

<body>






<div class="flex ">


    <!-- component -->
    <div class="font-poppins antialiased">
    <div
            id="view"
            class="h-full  flex flex-row"
            x-data="{ sidenav: true }"
    >
        <button
                @click="sidenav = true"
                class="p-2 border-2 bg-white rounded-md border-gray-200 shadow-lg text-gray-500 focus:bg-teal-500 focus:outline-none focus:text-white absolute top-0 left-0 sm:hidden"
        >
            <svg
                    class="w-5 h-5 fill-current"
                    fill="currentColor"
                    viewBox="0 0 20 20"
                    xmlns="http://www.w3.org/2000/svg"
            >
                <path
                        fill-rule="evenodd"
                        d="M3 5a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1zM3 10a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1zM3 15a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1z"
                        clip-rule="evenodd"
                ></path>
            </svg>
        </button>
        <div
                id="sidebar"
                class="bg-white h-screen md:block shadow-xl px-3 w-30 md:w-60 lg:w-60 overflow-x-hidden transition-transform duration-300 ease-in-out"
                x-show="sidenav"
                @click.away="sidenav = false"
        >
            <div class="space-y-6 md:space-y-10 mt-10">
                <h1 class="font-bold text-4xl text-center md:hidden">
                    D<span class="text-teal-600">.</span>
                </h1>
                <h1 class="hidden md:block font-bold text-sm md:text-xl text-center">
                    CNSS<span class="text-teal-600">.</span>
                </h1>
                <div id="profile" class="space-y-3">
                    <img
                            src="https://lobservateur.info/uploads/imported_images/uploads/2017/10/cnss.png"
                            alt="Avatar user"
                            class="w-10 md:w-16 rounded-full mx-auto"
                    />
                    <div>
                        <h2
                                class="font-medium text-xs md:text-sm text-center text-teal-500"
                        >
                            CNSS
                        </h2>
                        <p class="text-xs text-gray-500 text-center">Administrator</p>
                    </div>
                </div>
                <div
                        class="flex border-2 border-gray-200 rounded-md focus-within:ring-2 ring-teal-500"
                >
                    <input
                            type="text"
                            class="w-full rounded-tl-md rounded-bl-md px-2 py-3 text-sm text-gray-600 focus:outline-none"
                            placeholder="Search"
                    />
                    <button
                            class="rounded-tr-md rounded-br-md px-2 py-3 hidden md:block"
                    >
                        <svg
                                class="w-4 h-4 fill-current"
                                fill="currentColor"
                                viewBox="0 0 20 20"
                                xmlns="http://www.w3.org/2000/svg"
                        >
                            <path
                                    fill-rule="evenodd"
                                    d="M8 4a4 4 0 100 8 4 4 0 000-8zM2 8a6 6 0 1110.89 3.476l4.817 4.817a1 1 0 01-1.414 1.414l-4.816-4.816A6 6 0 012 8z"
                                    clip-rule="evenodd"
                            ></path>
                        </svg>
                    </button>
                </div>
                <div id="menu" class="flex flex-col space-y-2">
                    <a
                            href="/dossier/DisplayMedicament"
                            class="text-sm font-medium text-gray-700 py-2 px-2 hover:bg-teal-500 hover:text-white hover:text-base rounded-md transition duration-150 ease-in-out"
                    >
                        <svg
                                class="w-6 h-6 fill-current inline-block"
                                fill="currentColor"
                                viewBox="0 0 20 20"
                                xmlns="http://www.w3.org/2000/svg"
                        >
                            <path
                                    d="M5 3a2 2 0 00-2 2v2a2 2 0 002 2h2a2 2 0 002-2V5a2 2 0 00-2-2H5zM5 11a2 2 0 00-2 2v2a2 2 0 002 2h2a2 2 0 002-2v-2a2 2 0 00-2-2H5zM11 5a2 2 0 012-2h2a2 2 0 012 2v2a2 2 0 01-2 2h-2a2 2 0 01-2-2V5zM11 13a2 2 0 012-2h2a2 2 0 012 2v2a2 2 0 01-2 2h-2a2 2 0 01-2-2v-2z"
                            ></path>
                        </svg>
                        <span class=""> new folder</span>
                    </a>
                    <a
                            href=""
                            class="text-sm font-medium text-gray-700 py-2 px-2 hover:bg-teal-500 hover:text-white hover:scale-105 rounded-md transition duration-150 ease-in-out"
                    >
                        <svg
                                class="w-6 h-6 fill-current inline-block"
                                fill="currentColor"
                                viewBox="0 0 20 20"
                                xmlns="http://www.w3.org/2000/svg"
                        >
                            <path
                                    d="M2 5a2 2 0 012-2h7a2 2 0 012 2v4a2 2 0 01-2 2H9l-3 3v-3H4a2 2 0 01-2-2V5z"
                            ></path>
                            <path
                                    d="M15 7v2a4 4 0 01-4 4H9.828l-1.766 1.767c.28.149.599.233.938.233h2l3 3v-3h2a2 2 0 002-2V9a2 2 0 00-2-2h-1z"
                            ></path>
                        </svg>
                        <span class="">Messages</span>
                    </a>
                    <a
                            href=""
                            class="text-sm font-medium text-gray-700 py-2 px-2 hover:bg-teal-500 hover:text-white hover:scale-105 rounded-md transition duration-150 ease-in-out"
                    >
                        <svg
                                class="w-6 h-6 fill-current inline-block"
                                fill="currentColor"
                                viewBox="0 0 20 20"
                                xmlns="http://www.w3.org/2000/svg"
                        >
                            <path
                                    d="M13 6a3 3 0 11-6 0 3 3 0 016 0zM18 8a2 2 0 11-4 0 2 2 0 014 0zM14 15a4 4 0 00-8 0v3h8v-3zM6 8a2 2 0 11-4 0 2 2 0 014 0zM16 18v-3a5.972 5.972 0 00-.75-2.906A3.005 3.005 0 0119 15v3h-3zM4.75 12.094A5.973 5.973 0 004 15v3H1v-3a3 3 0 013.75-2.906z"
                            ></path>
                        </svg>
                        <span class="">Users</span>
                    </a>
                </div>
            </div>
        </div>

    </div>

    <script src="js/graph.js" type="text/javascript"></script>
    <script>
        var user = document.getElementById("user-chart").nodeName;
        var chart = new Graph({
            data: [1, 20, 5, 6, 8],
            target: document.querySelector(user),
        });
    </script>
    </div>













<div class="flex flex-col mt-24 w-full">
    <div class="overflow-x-auto sm:mx-0.5 lg:mx-0.5">
        <div class="py-2 inline-block min-w-full sm:px-6 lg:px-8">
            <div class="overflow-hidden">
                <table class="min-w-full">
                    <thead class="bg-white border-b">
                    <tr>
                        <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-left">
                            Id
                        </th>
                        <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-left">
                            Description
                        </th>
                        <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-left">
                            Remboursement
                        </th>
                        <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-left">
                            Status
                        </th>
                        <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-left">
                            Patient ref
                        </th>
                        <th scope="col" class="text-sm font-medium text-gray-900 px-6 py-4 text-left">
                            Action
                        </th>
                    </tr>
                    </thead>
                    <tbody>

                    <c:forEach var = "folder" items="${folders}">
                        <tr class="bg-gray-100 border-b">
                            <td class="px-6 py-4 whitespace-nowrap text-sm font-medium text-gray-900"> <c:out value = "${folder.getIddossier() }"/></td>
                            <td class="px-6 py-4 whitespace-nowrap text-sm font-medium text-gray-900"> <c:out value = "${folder.getDescription() }"/></td>
                            <td class="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap"><c:out value = "${folder.getRemboursement()}"/></td>
                            <td class="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap"><c:out value = "${folder.getStatus()}"/></td>
                            <td class="text-sm text-gray-900 font-light px-6 py-4 whitespace-nowrap"><c:out value = "${folder.getPatient().getIduser()}"/></td>
                            <td class="text-sm flex  text-gray-900 font-light px-6 py-4 whitespace-nowrap">
                                <form method="post" action="/dossier/update"><input type="hidden" name="id" value="${folder.getIddossier()}"> <input type="hidden" name="status" value="accepted">   <button> <image src="https://cdn-icons-png.flaticon.com/512/4315/4315445.png" class="h-8 w-8 mr-3" ></image> </button></form>
                                <form method="post" action="/dossier/update"><input type="hidden" name="id" value="${folder.getIddossier()}"> <input type="hidden" name="status" value="refused">   <button> <image src="https://cdn1.iconfinder.com/data/icons/smallicons-controls/32/614397-x-512.png" class="h-8 w-8 ml-3-" ></image> </button></form>
                            </td>

                        </tr>

                    </c:forEach>


                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>


</div>

</body>
</html>
